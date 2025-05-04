package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CountryCode;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CarrierServiceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCarrierService"));
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryAvailableServiceProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> availableServicesForCountries(
      ) {
    DeliveryAvailableServiceProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> projection = new DeliveryAvailableServiceProjection<>(this, this);    
    getFields().put("availableServicesForCountries", projection);
    return projection;
  }

  public DeliveryAvailableServiceProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> availableServicesForCountries(
      List<String> origins, List<CountryCode> countryCodes, boolean restOfWorld) {
    DeliveryAvailableServiceProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> projection = new DeliveryAvailableServiceProjection<>(this, this);    
    getFields().put("availableServicesForCountries", projection);
    getInputArguments().computeIfAbsent("availableServicesForCountries", k -> new ArrayList<>());                      
    InputArgument originsArg = new InputArgument("origins", origins);
    getInputArguments().get("availableServicesForCountries").add(originsArg);
    InputArgument countryCodesArg = new InputArgument("countryCodes", countryCodes);
    getInputArguments().get("availableServicesForCountries").add(countryCodesArg);
    InputArgument restOfWorldArg = new InputArgument("restOfWorld", restOfWorld);
    getInputArguments().get("availableServicesForCountries").add(restOfWorldArg);
    return projection;
  }

  public ImageProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> icon(
      ) {
    ImageProjection<CarrierServiceProjectionRoot<PARENT, ROOT>, CarrierServiceProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("icon", projection);
    return projection;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> formattedName() {
    getFields().put("formattedName", null);
    return this;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CarrierServiceProjectionRoot<PARENT, ROOT> supportsServiceDiscovery() {
    getFields().put("supportsServiceDiscovery", null);
    return this;
  }
}
