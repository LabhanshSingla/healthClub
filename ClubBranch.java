public class ClubBranch {
    int branchCode;
    String branchName;
    int activities;
    int employees;
    Member[] members = new Member[10];
/*
* Parameter: Member
* Return: Void
* This method adds a new member in members array.
* you can delete this later: it goes through the members array using for loop. Since the array is of size 10 that's why
* the final condition is i<10. it checks whether the element at index members[i] is null or not. if null then replaces
* it with new member.
 * */
    public void addMember(Member member){
            // If the last element is null, find the first null element and add the member
            for (int i = 0; i < 10; i++) {
                if (members[i] == null) {
                    members[i] = member;
                    break; // Break out of the loop once the member is added
                }
            }
    }

/*
 Return: Void
 this method prints the members in member array
 you can delete this later: it uses for loop to go through each element and prints the id,name and type of that particular
 member from the array
*\
 */
    public void showMembers(){
        for (int i=0; i<10;i++){
            if (members[i]!=null){
                System.out.println("Member ID:"+members[i].id+" Member Name:" + members[i].name + " Membership Type:" + members[i].type);
            }
        }
    }
    /*
     Parameter: int
     Return: Void
     this method prints the member with the given id
     you can delete this later: it uses for loop to go through each element and search the id of each member with the given
     id in the parameter. If it matches it prints the name and type of the member otherwise if there is no element
     with that id it prints no Member with this id.
    *\
     */
    public void showID(int id){
        for (int i=0; i<10; i++){
            if (members[i].id == id){
                System.out.println("Member Name:" + members[i].name + " Membership Type:" + members[i].type);
                return;
            }
        }
        System.out.println("No Member with this ID");
    }



}
