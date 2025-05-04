package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `appPurchaseOneTimeCreate` mutation.
 */
public class AppPurchaseOneTimeCreatePayload {
  /**
   * The newly created app one-time purchase.
   */
  private AppPurchaseOneTime appPurchaseOneTime;

  /**
   * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
   *   
   * If the merchant declines, then the merchant is redirected to the app and
   * receives a notification message stating that the charge was declined.
   * If the merchant approves and they're successfully invoiced, then the state of
   * the charge changes from `pending` to `active`.
   *   
   * You get paid after the charge is activated.
   */
  private String confirmationUrl;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public AppPurchaseOneTimeCreatePayload() {
  }

  /**
   * The newly created app one-time purchase.
   */
  public AppPurchaseOneTime getAppPurchaseOneTime() {
    return appPurchaseOneTime;
  }

  public void setAppPurchaseOneTime(AppPurchaseOneTime appPurchaseOneTime) {
    this.appPurchaseOneTime = appPurchaseOneTime;
  }

  /**
   * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
   *   
   * If the merchant declines, then the merchant is redirected to the app and
   * receives a notification message stating that the charge was declined.
   * If the merchant approves and they're successfully invoiced, then the state of
   * the charge changes from `pending` to `active`.
   *   
   * You get paid after the charge is activated.
   */
  public String getConfirmationUrl() {
    return confirmationUrl;
  }

  public void setConfirmationUrl(String confirmationUrl) {
    this.confirmationUrl = confirmationUrl;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AppPurchaseOneTimeCreatePayload{appPurchaseOneTime='" + appPurchaseOneTime + "', confirmationUrl='" + confirmationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPurchaseOneTimeCreatePayload that = (AppPurchaseOneTimeCreatePayload) o;
    return Objects.equals(appPurchaseOneTime, that.appPurchaseOneTime) &&
        Objects.equals(confirmationUrl, that.confirmationUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPurchaseOneTime, confirmationUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created app one-time purchase.
     */
    private AppPurchaseOneTime appPurchaseOneTime;

    /**
     * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
     *   
     * If the merchant declines, then the merchant is redirected to the app and
     * receives a notification message stating that the charge was declined.
     * If the merchant approves and they're successfully invoiced, then the state of
     * the charge changes from `pending` to `active`.
     *   
     * You get paid after the charge is activated.
     */
    private String confirmationUrl;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public AppPurchaseOneTimeCreatePayload build() {
      AppPurchaseOneTimeCreatePayload result = new AppPurchaseOneTimeCreatePayload();
      result.appPurchaseOneTime = this.appPurchaseOneTime;
      result.confirmationUrl = this.confirmationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created app one-time purchase.
     */
    public Builder appPurchaseOneTime(AppPurchaseOneTime appPurchaseOneTime) {
      this.appPurchaseOneTime = appPurchaseOneTime;
      return this;
    }

    /**
     * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
     *   
     * If the merchant declines, then the merchant is redirected to the app and
     * receives a notification message stating that the charge was declined.
     * If the merchant approves and they're successfully invoiced, then the state of
     * the charge changes from `pending` to `active`.
     *   
     * You get paid after the charge is activated.
     */
    public Builder confirmationUrl(String confirmationUrl) {
      this.confirmationUrl = confirmationUrl;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
