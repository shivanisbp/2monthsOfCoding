/*
Problem Name: 1603. Design Parking System
Problem Link: https://leetcode.com/problems/design-parking-system/
*/
class ParkingSystem {
    int capacity[];
    int current[];
    public ParkingSystem(int big, int medium, int small) {
        capacity = new int[3];
        capacity[0] = big;
        capacity[1] = medium;
        capacity[2] = small;
        current = new int[3];
    }
    
    public boolean addCar(int carType) {
        if(current[carType-1] < capacity[carType-1]){
            current[carType-1]++;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
