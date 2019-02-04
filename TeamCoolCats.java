package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.FreemanMember;

public class TeamCoolCats extends Team {

    public TeamCoolCats(String name){
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers(){
        members.add(new FreemanMember("Trae Freeman"));
    }


}
