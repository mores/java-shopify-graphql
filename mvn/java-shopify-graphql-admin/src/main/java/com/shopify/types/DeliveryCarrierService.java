package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCarrierService implements com.shopify.types.Node {
  
  private boolean active;

  
  private List<DeliveryAvailableService> availableServicesForCountries;

  
  private String callbackUrl;

  
  private String formattedName;

  
  private Image icon;

  
  private String id;

  
  private String name;

  
  private boolean supportsServiceDiscovery;

  public DeliveryCarrierService() {
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  
  public List<DeliveryAvailableService> getAvailableServicesForCountries() {
    return availableServicesForCountries;
  }

  public void setAvailableServicesForCountries(
      List<DeliveryAvailableService> availableServicesForCountries) {
    this.availableServicesForCountries = availableServicesForCountries;
  }

  
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  public String getFormattedName() {
    return formattedName;
  }

  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }

  
  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public boolean getSupportsServiceDiscovery() {
    return supportsServiceDiscovery;
  }

  public void setSupportsServiceDiscovery(boolean supportsServiceDiscovery) {
    this.supportsServiceDiscovery = supportsServiceDiscovery;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierService{active='" + active + "', availableServicesForCountries='" + availableServicesForCountries + "', callbackUrl='" + callbackUrl + "', formattedName='" + formattedName + "', icon='" + icon + "', id='" + id + "', name='" + name + "', supportsServiceDiscovery='" + supportsServiceDiscovery + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierService that = (DeliveryCarrierService) o;
    return active == that.active &&
        Objects.equals(availableServicesForCountries, that.availableServicesForCountries) &&
        Objects.equals(callbackUrl, that.callbackUrl) &&
        Objects.equals(formattedName, that.formattedName) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        supportsServiceDiscovery == that.supportsServiceDiscovery;
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, availableServicesForCountries, callbackUrl, formattedName, icon, id, name, supportsServiceDiscovery);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean active;

    
    private List<DeliveryAvailableService> availableServicesForCountries;

    
    private String callbackUrl;

    
    private String formattedName;

    
    private Image icon;

    
    private String id;

    
    private String name;

    
    private boolean supportsServiceDiscovery;

    public DeliveryCarrierService build() {
      DeliveryCarrierService result = new DeliveryCarrierService();
      result.active = this.active;
      result.availableServicesForCountries = this.availableServicesForCountries;
      result.callbackUrl = this.callbackUrl;
      result.formattedName = this.formattedName;
      result.icon = this.icon;
      result.id = this.id;
      result.name = this.name;
      result.supportsServiceDiscovery = this.supportsServiceDiscovery;
      return result;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder availableServicesForCountries(
        List<DeliveryAvailableService> availableServicesForCountries) {
      this.availableServicesForCountries = availableServicesForCountries;
      return this;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder formattedName(String formattedName) {
      this.formattedName = formattedName;
      return this;
    }

    
    public Builder icon(Image icon) {
      this.icon = icon;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder supportsServiceDiscovery(boolean supportsServiceDiscovery) {
      this.supportsServiceDiscovery = supportsServiceDiscovery;
      return this;
    }
  }
}
