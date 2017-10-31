package ru.stqa.pft.adressbook.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;

public class Users extends ForwardingSet <UserFields> {

  private Set<UserFields> delegate;

  @Override
  protected Set<UserFields> delegate() {
    return delegate;
  }

  public Users (Users users) {
    this.delegate= new HashSet<UserFields>(users.delegate);
  }

  public Users() {
    this.delegate = new HashSet<UserFields>();
  }

  public Users withAdded(UserFields user) {
    Users users = new Users(this);
    users.add(user);
    return users;
  }

  public Users without(UserFields user) {
    Users users = new Users(this);
    users.remove(user);
    return users;
  }

}
