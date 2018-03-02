package MaxPointsParticipantsMV;


import MaxPointsParticipantsMV.repository.Repository;
import MaxPointsParticipantsMV.ui.ParticipantUI;
import MaxPointsParticipantsMV.controller.ParticipantController;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        //String participantsFile = "c:/Temp/SSVV/nmpie1234/src/main/java/npie1234MV/FileParticipants.txt";
        String participantsFile = "src/main/java/MaxPointsParticipantsMV/FileParticipants.txt";
        //String participantsFile = "FileParticipants.txt";



        Repository repo = new Repository(participantsFile);
        ParticipantController ctrl = new ParticipantController(repo);

        ParticipantUI console = new ParticipantUI(ctrl);
        console.Run();
    }

}
