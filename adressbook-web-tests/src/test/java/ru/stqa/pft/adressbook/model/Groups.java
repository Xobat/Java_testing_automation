package ru.stqa.pft.adressbook.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;

public class Groups extends ForwardingSet<GroupFields> {

  private Set<GroupFields> delegate;

  public Groups(Groups groups) {
    this.delegate=new HashSet<GroupFields>(groups.delegate);
  }

  public Groups() {
    this.delegate = new HashSet<>();
  }

  @Override
  protected Set<GroupFields> delegate() {
    return delegate;
  }

  public Groups withAdded(GroupFields group) {
    Groups groups = new Groups(this);
    groups.add(group);
    return groups;
  }

  public Groups without(GroupFields group) {
    Groups groups = new Groups(this);
    groups.remove(group);
    return groups;
  }

}
