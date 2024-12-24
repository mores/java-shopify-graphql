package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerPaymentMethodRemoteInput {
  
  private RemoteStripePaymentMethodInput stripePaymentMethod;

  /**
   * The input fields for a remote authorize net customer profile.
   */
  private RemoteAuthorizeNetCustomerPaymentProfileInput authorizeNetCustomerPaymentProfile;

  
  private RemoteBraintreePaymentMethodInput braintreePaymentMethod;

  public CustomerPaymentMethodRemoteInput() {
  }

  
  public RemoteStripePaymentMethodInput getStripePaymentMethod() {
    return stripePaymentMethod;
  }

  public void setStripePaymentMethod(RemoteStripePaymentMethodInput stripePaymentMethod) {
    this.stripePaymentMethod = stripePaymentMethod;
  }

  /**
   * The input fields for a remote authorize net customer profile.
   */
  public RemoteAuthorizeNetCustomerPaymentProfileInput getAuthorizeNetCustomerPaymentProfile() {
    return authorizeNetCustomerPaymentProfile;
  }

  public void setAuthorizeNetCustomerPaymentProfile(
      RemoteAuthorizeNetCustomerPaymentProfileInput authorizeNetCustomerPaymentProfile) {
    this.authorizeNetCustomerPaymentProfile = authorizeNetCustomerPaymentProfile;
  }

  
  public RemoteBraintreePaymentMethodInput getBraintreePaymentMethod() {
    return braintreePaymentMethod;
  }

  public void setBraintreePaymentMethod(RemoteBraintreePaymentMethodInput braintreePaymentMethod) {
    this.braintreePaymentMethod = braintreePaymentMethod;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodRemoteInput{stripePaymentMethod='" + stripePaymentMethod + "', authorizeNetCustomerPaymentProfile='" + authorizeNetCustomerPaymentProfile + "', braintreePaymentMethod='" + braintreePaymentMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodRemoteInput that = (CustomerPaymentMethodRemoteInput) o;
    return Objects.equals(stripePaymentMethod, that.stripePaymentMethod) &&
        Objects.equals(authorizeNetCustomerPaymentProfile, that.authorizeNetCustomerPaymentProfile) &&
        Objects.equals(braintreePaymentMethod, that.braintreePaymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripePaymentMethod, authorizeNetCustomerPaymentProfile, braintreePaymentMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private RemoteStripePaymentMethodInput stripePaymentMethod;

    /**
     * The input fields for a remote authorize net customer profile.
     */
    private RemoteAuthorizeNetCustomerPaymentProfileInput authorizeNetCustomerPaymentProfile;

    
    private RemoteBraintreePaymentMethodInput braintreePaymentMethod;

    public CustomerPaymentMethodRemoteInput build() {
      CustomerPaymentMethodRemoteInput result = new CustomerPaymentMethodRemoteInput();
      result.stripePaymentMethod = this.stripePaymentMethod;
      result.authorizeNetCustomerPaymentProfile = this.authorizeNetCustomerPaymentProfile;
      result.braintreePaymentMethod = this.braintreePaymentMethod;
      return result;
    }

    
    public Builder stripePaymentMethod(RemoteStripePaymentMethodInput stripePaymentMethod) {
      this.stripePaymentMethod = stripePaymentMethod;
      return this;
    }

    /**
     * The input fields for a remote authorize net customer profile.
     */
    public Builder authorizeNetCustomerPaymentProfile(
        RemoteAuthorizeNetCustomerPaymentProfileInput authorizeNetCustomerPaymentProfile) {
      this.authorizeNetCustomerPaymentProfile = authorizeNetCustomerPaymentProfile;
      return this;
    }

    
    public Builder braintreePaymentMethod(
        RemoteBraintreePaymentMethodInput braintreePaymentMethod) {
      this.braintreePaymentMethod = braintreePaymentMethod;
      return this;
    }
  }
}
