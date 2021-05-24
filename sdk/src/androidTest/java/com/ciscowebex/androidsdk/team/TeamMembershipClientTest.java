package com.ciscowebex.androidsdk.team;

import com.ciscowebex.androidsdk.Webex;
import com.ciscowebex.androidsdk.membership.MembershipClient;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.ciscowebex.androidsdk.WebexTestRunner.getWebex;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeamMembershipClientTest {

    static Webex webex;
    static TeamMembershipClient client;

    @BeforeClass
    public static void setUpBeforeClass() {
        webex = getWebex();
        client = webex.teamMembershipClient();
    }

    @Test
    public void list() throws InterruptedException {
        /*
        final CountDownLatch signal = new CountDownLatch(1);
        client.list("", 10, result -> {
            System.out.println(result);
            signal.countDown();
        });
        signal.await(30, TimeUnit.SECONDS);
        */
    }

    @Test
    public void create() throws InterruptedException {
        /*
        final CountDownLatch signal = new CountDownLatch(1);
        client.create("", "", "", true, result -> {
            System.out.println(result);
            signal.countDown();
        });
        signal.await(30, TimeUnit.SECONDS);
        */
    }

    @Test
    public void get() throws InterruptedException {
        /*
        final CountDownLatch signal = new CountDownLatch(1);
        client.get("", result -> {
            System.out.println(result);
            signal.countDown();
        });
        signal.await(30, TimeUnit.SECONDS);
        */
    }

    @Test
    public void update() throws InterruptedException {
        /*
        final CountDownLatch signal = new CountDownLatch(1);
        client.update("", true, result -> {
            System.out.println(result);
            signal.countDown();
        });
        signal.await(30, TimeUnit.SECONDS);
        */
    }

    @Test
    public void delete() throws InterruptedException {
        /*
        final CountDownLatch signal = new CountDownLatch(1);
        client.delete("", result -> {
            System.out.println(result);
            signal.countDown();
        });
        signal.await(30, TimeUnit.SECONDS);
        */
    }
}