class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            Node node = s.pop();
            list.addFirst(node.val);
            for(Node child : node.children){
                s.push(child);
            }
        }
        return list;
    }
}