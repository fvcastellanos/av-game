package edu.umg.ia.domain;

public class Action extends Sequence {
	private String name;
	private String result;
	private boolean toInventory;
	private Precondition precondition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isToInventory() {
        return toInventory;
    }

    public void setToInventory(boolean toInventory) {
        this.toInventory = toInventory;
    }

    public Precondition getPrecondition() {
        return precondition;
    }

    public void setPrecondition(Precondition precondition) {
        this.precondition = precondition;
    }
}
