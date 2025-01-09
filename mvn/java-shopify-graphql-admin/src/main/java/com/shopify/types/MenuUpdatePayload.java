package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `menuUpdate` mutation.
 */
public class MenuUpdatePayload {
  /**
   * The updated menu.
   */
  private Menu menu;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MenuUpdateUserError> userErrors;

  public MenuUpdatePayload() {
  }

  /**
   * The updated menu.
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
  public List<MenuUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MenuUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MenuUpdatePayload{menu='" + menu + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuUpdatePayload that = (MenuUpdatePayload) o;
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
     * The updated menu.
     */
    private Menu menu;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MenuUpdateUserError> userErrors;

    public MenuUpdatePayload build() {
      MenuUpdatePayload result = new MenuUpdatePayload();
      result.menu = this.menu;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated menu.
     */
    public Builder menu(Menu menu) {
      this.menu = menu;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MenuUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
