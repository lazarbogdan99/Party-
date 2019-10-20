/**
 * Profile.java
 * @author Lazar Bogdan
 * This class represnts a person's profile where the user's data is stored
 */

import java.lang.reflect.Array;
import java.util.*;

public class Profile {
     private String lastName;
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String townOfResidence;
    private String countryOfResidence;
    private String nationality;
    private String e_mail;
    private Profile p;
    private ArrayList<Profile> friendsList = new ArrayList<>();
    private String[]  interests;

    /**
     * This method adds friends to the friendlist array with profile references
     * @param p adds the profile p to the user's friendlist
     */
    public void addFriend(Profile p) {

        friendsList.add(p);
    }

    /**
     * This method gets a friend from the user's friendlist
     * @param i is the index representing a profile from friendlist
     * @return the reference of the firend's profile
     */
    public Profile getFriend(int i) {

        return friendsList.get(i);
    }

    /**
     * This method shows the number of friends in the friendlist
     * @return the size of the friendlist
     */
    public int numOfFriends() {

        return friendsList.size();
    }

    /**
     *This is a constructor
     * @param lastName string used to store the lastName
     * @param firstName string used to store the firstName
     * @param day integer used to store the day in order to get the date of birth
     * @param month integer  used to store the month in order to get the date of birth
     * @param year integer  used to store the year in order to get the date of birth
     * @param townOfResidence string  used to store the residence town
     * @param countryOfResidence string  used to store the residence country
     * @param nationality string  used to store the nationality
     * @param e_mail string  used to store the e-mail address
     * @param interests used to store the interests
     */
    public Profile(String lastName, String firstName, int day, int month, int year, String townOfResidence, String countryOfResidence, String nationality, String e_mail, String[]  interests) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.townOfResidence = townOfResidence;
        this.countryOfResidence = countryOfResidence;
        this.nationality = nationality;
        this.e_mail = e_mail;
        this. interests =  interests;

    }

    /**
     * This method gets the intersts
     * @return the interests into an array
     */
    public String[] getIntersts(){
        return interests;
    }

    /**
     * This method sets the intersts
     * @param interests used to store the interests
     */
    public void setInterests(String[] interests) {
        this.getIntersts();
    }

    /**
     * This method sets the e-mail
     * @param e_mail string  used to store the e-mail address
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    /**
     * This method gets the e-mail
     * @ return the e-mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * This method gets the name
     * @return the full name
     */
    public String getName() {
        return (lastName + " " + firstName);
    }

    /**
     *  This method sets the residence town
     * @param townOfResidence string  used to store the residence town
     */
    public void setTownOfResidence(String townOfResidence) {
        this.townOfResidence = townOfResidence;
    }

    /**
     * This method gets the town of residence
     * @return the town of residence
     */
    public String getTownOfResidence() {
        return townOfResidence;
    }

    /**
     * This method sets the country of resicdence
     * @param countryOfResidence string  used to store the residence country
     */
    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    /**
     * This method gets the residence country
     * @return  the residence country
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * This  method sets the nationality
     * @param nationality  string  used to store the nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * This method gets the nationality
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * This method gets the date of birth
     * @return the date of birth in the follwoing format DD.MM.YYYY
     */
    public String getDateOfBirth() {
        return (this.day + "." + this.month + "." + this.year);
    }

    /**
     * This method converts the profile into a string
     * @return the profile looking like a string
     */
    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", townOfResidence='" + townOfResidence + '\'' +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                ", nationality='" + nationality + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}

