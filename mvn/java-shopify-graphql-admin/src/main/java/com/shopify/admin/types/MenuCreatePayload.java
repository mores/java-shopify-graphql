package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `menuCreate` mutation.
 */
public class MenuCreatePayload {
  /**
   * The created menu.
   */
  private Menu menu;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MenuCreateUserError> userErrors;

  public MenuCreatePayload() {
  }

  /**
   * The created menu.
   */
  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MenuCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MenuCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MenuCreatePayload{menu='" + menu + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuCreatePayload that = (MenuCreatePayload) o;
    return Objects.equals(menu, that.menu) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created menu.
     */
    private Menu menu;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MenuCreateUserError> userErrors;

    public MenuCreatePayload build() {
      MenuCreatePayload result = new MenuCreatePayload();
      result.menu = this.menu;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created menu.
     */
    public Builder menu(Menu menu) {
      this.menu = menu;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MenuCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
