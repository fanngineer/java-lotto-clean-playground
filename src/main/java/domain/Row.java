package domain;

import java.util.List;

public class Row {
    private List<Integer> nums;
    private static final int ROW_SIZE = 6;

    public Row(List<Integer> nums) {
        sizeCheck(nums);
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void sizeCheck(List<Integer> nums){
        if(nums.size() != ROW_SIZE){
            throw new RuntimeException("로또 한줄은 수가 6개 필요합니다.");
        }
    }

    public void duplicateCheck(List<Integer> nums){
        if(nums.size() != nums.stream().distinct().count()){
            throw new RuntimeException("로또 한줄의 수는 중복될 수 없습니다.");
        }
    }
}