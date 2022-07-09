
class Solution2 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String skill_input:skill_trees){
            String[] temp = skill_input.split("");//하나의 스킬트리 쪼갬
            for(int i=0;i<temp.length;i++){
                if(skill.contains(temp[i])==false){
                    skill_input =skill_input.replace(temp[i],"");
                }
            }
            if(skill.indexOf(skill_input)==0) answer++;
        }
        return answer;
    }
}
