package Tree;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode mark=new TreeNode("Marks",5,null,null);
        TreeNode book=new TreeNode("book",6,null,null);
        TreeNode courses=new TreeNode("courses",7,null,null);
        TreeNode data_structure=new TreeNode("data_structure",8,null,null);
        TreeNode login=new TreeNode("login",8,null,null);


        TreeNode session =new TreeNode("session",9,null,null);
        TreeNode user_name =new TreeNode("user_name",10,null,null);

        TreeOperations myTree=new TreeOperations();
        myTree.root=mark;
        mark.firstChild=book;
        book.nextSibling=courses;
        courses.nextSibling=login;
        courses.firstChild=data_structure;
        login.firstChild=session;
        session.nextSibling=user_name;

        myTree.listAll(myTree.root,0);
        System.out.println( myTree.listAllSizes(myTree.root));

        //11 26 34 43 53
    }
}