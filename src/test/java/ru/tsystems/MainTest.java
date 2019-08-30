package ru.tsystems;

import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JButtonFixture;
import org.assertj.swing.fixture.JTextComponentFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.Test;

import javax.swing.*;

import static org.assertj.swing.launcher.ApplicationLauncher.application;

public class MainTest extends AssertJSwingJUnitTestCase {
    private FrameFixture window;
    private JTextComponentFixture display;
    //    private JTextComponentFixture display;
//    private JButtonFixture delete;
//    private JButtonFixture[] digits;

    @Override
    protected void onSetUp() {
        application(Main.class).start();
        window = WindowFinder.findFrame(new GenericTypeMatcher<JFrame>(JFrame.class) {
            protected boolean isMatching(JFrame frame) {
                return "MyCalculator".equals(frame.getTitle());
            }
        }).using(robot());
        display = window.textBox("Display");
        window.focus();
    }

    @Override
    protected void onTearDown() {
        window.cleanUp();
    }

    @Test
    public void testDisplayAtStart() {
        display.requireText("0");
    }

    @Test
    public void testPressZero() {
        display.setText("0");
        window.button("0").focus();
        window.button("0").click();
        display.requireText("0");
     }
}