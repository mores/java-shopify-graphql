package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MenuDeletePayload {
  
  private String deletedMenuId;

  
  private List<MenuDeleteUserError> userErrors;

  public MenuDeletePayload() {
  }

  
  public String getDeletedMenuId() {
    return deletedMenuId;
  }

  public void setDeletedMenuId(String deletedMenuId) {
    this.deletedMenuId = deletedMenuId;
  }

  
  public List<MenuDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MenuDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MenuDeletePayload{deletedMenuId='" + deletedMenuId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuDeletePayload that = (MenuDeletePayload) o;
    return Objects.equals(deletedMenuId, that.deletedMenuId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMenuId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedMenuId;

    
    private List<MenuDeleteUserError> userErrors;

    public MenuDeletePayload build() {
      MenuDeletePayload result = new MenuDeletePayload();
      result.deletedMenuId = this.deletedMenuId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedMenuId(String deletedMenuId) {
      this.deletedMenuId = deletedMenuId;
      return this;
    }

    
    public Builder userErrors(List<MenuDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
