package ru.stqa.pft.adressbook.model;

public class UserFields {
  private String firstName;
  private String middleName;
  private String lastName;
  private String nickName;
  private String title;
  private String company;
  private String address;
  private String home;
  private String mobile;
  private String work;
  private String fax;
  private String email1;
  private String email2;
  private String email3;
  private String homepage;
  private String bYear;
  private String aYear;
  private String address2;
  private String phone2;
  private String notes;
  private int groupID;


  public UserFields withName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserFields withMiddleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  public UserFields withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public UserFields withNickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  public UserFields withTitle(String title) {
    this.title = title;
    return this;
  }

  public UserFields withCompany(String company) {
    this.company = company;
    return this;
  }

  public UserFields withAdress(String address) {
    this.address = address;
    return this;
  }

  public UserFields withHome(String home) {
    this.home = home;
    return this;
  }

  public UserFields withMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public UserFields withWork(String work) {
    this.work = work;
    return this;
  }

  public UserFields withFax(String fax) {
    this.fax = fax;
    return this;
  }

  public UserFields withEmail1(String email1) {
    this.email1 = email1;
    return this;
  }

  public UserFields withEmail2(String email2) {
    this.email2 = email2;
    return this;
  }

  public UserFields withEmail3(String email3) {
    this.email3 = email3;
    return this;
  }

  public UserFields withHomepage(String homepage) {
    this.homepage = homepage;
    return this;
  }

  public UserFields withBYear(String bYear) {
    this.bYear = bYear;
    return this;
  }

  public UserFields withAYear(String aYear) {
    this.aYear = aYear;
    return this;
  }

  public UserFields withAddress2(String address2) {
    this.address2 = address2;
    return this;
  }

  public UserFields withPhone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

  public UserFields withNotes(String notes) {
    this.notes = notes;
    return this;
  }

  public UserFields withGroupID(int groupID) {
    this.groupID = groupID;
    return this;
  }

  public String getFirstName() {
    return firstName;

  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHome() {
    return home;
  }

  public String getMobile() {
    return mobile;
  }

  public String getWork() {
    return work;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomepage() {
    return homepage;
  }

  public String getbYear() {
    return bYear;
  }

  public String getaYear() {
    return aYear;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }
public int getGroupID() {
    return groupID;
}
}
