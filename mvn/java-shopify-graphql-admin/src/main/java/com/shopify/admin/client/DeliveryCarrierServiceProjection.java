package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CountryCode;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DeliveryCarrierServiceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierServiceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierService"));
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryAvailableServiceProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> availableServicesForCountries(
      ) {
     DeliveryAvailableServiceProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> projection = new DeliveryAvailableServiceProjection<>(this, getRoot());
     getFields().put("availableServicesForCountries", projection);
     return projection;
  }

  public DeliveryAvailableServiceProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> availableServicesForCountries(
      List<String> origins, List<CountryCode> countryCodes, boolean restOfWorld) {
    DeliveryAvailableServiceProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> projection = new DeliveryAvailableServiceProjection<>(this, getRoot());    
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

  public ImageProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> icon() {
     ImageProjection<DeliveryCarrierServiceProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> formattedName() {
    getFields().put("formattedName", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<PARENT, ROOT> supportsServiceDiscovery() {
    getFields().put("supportsServiceDiscovery", null);
    return this;
  }
}
