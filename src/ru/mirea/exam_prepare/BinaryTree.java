package ru.mirea.exam_prepare;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // Метод для добавления узла в дерево
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Метод для удаления узла из дерева
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Найден узел для удаления

            // Узел с одним или без детей
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Узел с двумя детьми: получаем наименьший элемент в правом поддереве
            root.key = minValue(root.right);

            // Удаляем наименьший элемент в правом поддереве
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Пример использования
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Дерево до удаления 20:");
        tree.bypass();

        tree.delete(20);

        System.out.println("\nДерево после удаления 20:");
        tree.bypass();
    }

    // Обход дерева в порядке возрастания
    public void bypass() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }
}
