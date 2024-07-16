/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        Map<Integer, TreeNode> parentMap = new HashMap<>();

        TreeNode startNode = findStartNode(root, startValue);
        populateParentMap(root, parentMap);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(startNode);
        Set<TreeNode> visitedNodes = new HashSet<>();
        Map<TreeNode, Pair<TreeNode, String>> pathTracker = new HashMap<>();
        visitedNodes.add(startNode);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.val == destValue){
                return backtrackPath(currentNode, pathTracker);
            }
            if(parentMap.containsKey(currentNode.val)){
                TreeNode parentNode = parentMap.get(currentNode.val);
                if(!visitedNodes.contains(parentNode)){
                    queue.add(parentNode);
                    pathTracker.put(parentNode, new Pair(currentNode, "U"));
                    visitedNodes.add(parentNode);
                }
            }
            if(
                currentNode.left != null &&
                !visitedNodes.contains(currentNode.left)
            ){
                queue.add(currentNode.left);
                pathTracker.put(currentNode.left, new Pair(currentNode, "L"));
                visitedNodes.add(currentNode.left);
            }
            if(
                currentNode.right != null && 
                !visitedNodes.contains(currentNode.right)
            ){
                queue.add(currentNode.right);
                pathTracker.put(currentNode.right, new Pair(currentNode, "R"));
                visitedNodes.add(currentNode.right);
            }
        }
        return "";
    }
    private String backtrackPath(
        TreeNode node, 
        Map<TreeNode, Pair<TreeNode, String>> pathTracker
    ){
        StringBuilder path = new StringBuilder();
        while(pathTracker.containsKey(node)){
            path.append(pathTracker.get(node).getValue());
            node = pathTracker.get(node).getKey();
        }
        path.reverse();
        return path.toString();
    }
    private void populateParentMap(
        TreeNode node, 
        Map<Integer, TreeNode> parentMap
    ){
        if(node == null) return;
        if(node.left != null){
            parentMap.put(node.left.val, node);
            populateParentMap(node.left, parentMap);
        }
        if(node.right != null){
            parentMap.put(node.right.val, node);
            populateParentMap(node.right, parentMap);
        }
    }
    private TreeNode findStartNode(TreeNode node, int startValue){
        if(node == null) return null;
        if(node.val == startValue) return node;
        TreeNode leftResult = findStartNode(node.left, startValue);
        if(leftResult != null) return leftResult;
        return findStartNode(node.right, startValue);
    }
}