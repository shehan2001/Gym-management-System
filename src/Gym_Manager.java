import sample.Default_members;

import java.io.IOException;
import java.util.List;

public  interface  Gym_Manager {

        
        public void Add_New_Member();
        public void  Delete_Old_Member(String member_number);
        public void  list_of_members();
        public void Sort_ascending();        public void save_member();
        public List<Default_members> get_member_list();
        public  Default_members  Search(String member_number);


    }

