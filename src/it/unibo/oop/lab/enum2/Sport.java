/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
BASKET, VOLLEY , TENNIS, BIKE, F1 , MOTOGP , SOCCER ;
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
 private final Integer teamMemberscounter;
 private final String actualName;
 private final Place<String> place= new Place<>("OUTDOOR");
 private final Place<String> place= new Place<>("INDOOR");
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
 Sport (final Place pl, final int teamMembers, final String name) {
	 this.place= pl;
	 this.teamMemberscounter= TeamMembers;
	 this.actualName= name;
 }

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
 public boolean isIndividualSport() {
	 if (this.teamMemberscounter==1) 
		 return true;

 }
 public boolean isIndoorSport() {
	 if(this.place == "OUTDOOR")
		 return true;
 }
 public Place getPlace() {
	 return sports.this.place;
 }

public String toString() {
	return "sport : name = " + this.actualname + ", palce = " + this.palce + ", membersPerTeam= " + this.teamMembersCounter + ; 
}
}

