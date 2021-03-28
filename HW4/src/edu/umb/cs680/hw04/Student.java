package edu.umb.cs680.hw04;

class Student {
    private float tuition;
    private String name;
    private int i20num;
    private String usAddr;
    private int yrsInState;
    private String foreignAddr;
    private Status status;

    protected Student(String name, int i20num,
                      String usAddr, int yrsInState,
                      String foreignAddr, Status status){
        this.name = name;
        this.i20num = i20num;
        this.usAddr = usAddr;
        this.yrsInState = yrsInState;
        this.foreignAddr = foreignAddr;
        this.status = status;

    }


    public String getName() {
        return name;
    }

    public int getI20Num(){
        return i20num;
    }

    public String getUsAddr(){
        return usAddr;
    }

    public int getYrsInState(){ return yrsInState; }

    public String getForeignAddr(){
        return foreignAddr;
    }

    public void setTuition(float tuition){
        this.tuition = tuition;
    }

    public Status getStatus(){
        return status;
    }

    public float getTuition() {
        return tuition;
    }




}
