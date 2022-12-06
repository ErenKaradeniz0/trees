package Tree;

public class TreeOperations {
    TreeNode root;
    int totalSize = 0;

    public TreeOperations() {
        root = null;
    }

    public void listAll(TreeNode eleman, int depth) {
        TreeNode temp = eleman;

        for (int i = 0; i < depth; i++) System.out.print("\t");

        System.out.println(temp.directory_name);
        if (eleman.firstChild != null) {
            temp = eleman.firstChild;
            while (temp != null) {
                listAll(temp, depth + 1);
                temp = temp.nextSibling;
            }
        }
    }

    public int listAllSizes(TreeNode eleman) {

        int size = eleman.directory_size;
        totalSize += size;
        System.out.println(eleman.directory_name + ":" + size);
        if (eleman.firstChild != null) {

            TreeNode temp = eleman.firstChild;
            while (temp != null) {
                listAllSizes(temp);
                temp = temp.nextSibling;
            }

        }
            return totalSize;

    }
}
