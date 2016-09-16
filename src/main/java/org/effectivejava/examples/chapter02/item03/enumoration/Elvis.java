// Enum singleton - the preferred approach - page 18
package org.effectivejava.examples.chapter02.item03.enumoration;

public enum Elvis {
    INSTINCE;

    {
        System.out.println("single elvis");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTINCE;
        Elvis eis = Elvis.INSTINCE;
        System.out.println("Whoa baby, my name is " + eis.name());

        //elvis.leaveTheBuilding();
    }

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}
}
