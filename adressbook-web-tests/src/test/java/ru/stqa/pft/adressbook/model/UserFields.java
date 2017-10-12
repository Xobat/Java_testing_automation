package ru.stqa.pft.adressbook.model;

public class UserFields {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String home;
  private final String mobile;
  private final String work;
  private final String fax;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String homepage;
  private final String bYear;
  private final String aYear;
  private final String address2;
  private final String phone2;
  private final String notes;
  private final String group;



  public UserFields(String firstName, String middleName, String lastName, String nickName, String company, String title, String address, String home, String mobile, String work, String fax, String email1, String email2, String email3, String homepage, String bYear, String aYear, String address2, String phone2, String notes, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.company = company;
    this.title = title;
    this.address = address;
    this.home = home;
    this.mobile = mobile;
    this.work = work;
    this.fax = fax;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homepage = homepage;
    this.bYear = bYear;
    this.aYear = aYear;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
    this.group = group;
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
public String getGroup() {
    return group;
}
}
