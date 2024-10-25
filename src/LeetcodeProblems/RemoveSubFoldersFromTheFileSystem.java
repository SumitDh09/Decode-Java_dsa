package LeetcodeProblems;
import java.util.*;

public class RemoveSubFoldersFromTheFileSystem {
    public static void main(String[] args) {
        RemoveSubFoldersFromTheFileSystem solution = new RemoveSubFoldersFromTheFileSystem();
        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> result = solution.removeSubfolders(folder);
        System.out.println(result);
    }

    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        String prev = "";

        Arrays.sort(folder);

        for (final String f : folder) {
            if (!prev.isEmpty() && f.startsWith(prev) && f.charAt(prev.length()) == '/')
                continue;
            ans.add(f);
            prev = f;
        }

        return ans;
    }
}
