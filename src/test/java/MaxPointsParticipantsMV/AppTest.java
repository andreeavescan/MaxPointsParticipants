package MaxPointsParticipantsMV;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



import MaxPointsParticipantsMV.repository.Repository;
import MaxPointsParticipantsMV.controller.ParticipantController;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{



    private Repository rep;
    private ParticipantController ctrl;

    public void test_tc_4_AllParticipantsMax() {

        rep = new Repository("src/test/java/MaxPointsParticipantsMV/FileParticipantsMaxAll.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(4, noParticipantsMax);
    }

    public void test_tc_3_AllParticipantsOnlyOne() {
        rep = new Repository("src/test/java/MaxPointsParticipantsMV/FileParticipantsMaxOne.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(1, noParticipantsMax);
    }


    public void test_tc_20_ParticipantsWith99Points() {
        rep = new Repository("src/test/java/MaxPointsParticipantsMV/FileParticipants99Points.txt");

        ctrl=new ParticipantController(rep);
        int noParticipantsMax= ctrl.getNumberOfParticipantWithMaxPointsReceived();

        assertEquals(3, noParticipantsMax);
    }



    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
