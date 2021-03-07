package Builder;

interface Builder {
    void reset();
    void setSeats(int numberofseats);
    void setEngine(String engine);
    void setTripComputer(boolean systeofnavigation);
    void setGPS(boolean location);
}
