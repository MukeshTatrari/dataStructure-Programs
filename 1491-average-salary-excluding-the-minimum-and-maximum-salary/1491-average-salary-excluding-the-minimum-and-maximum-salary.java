class Solution {

    public double average(int[] salary) {
        Arrays.sort(salary);
        double average1 = Arrays.stream(salary).skip(1).limit(salary.length - 2).average().getAsDouble();
        return average1;
    }
}
