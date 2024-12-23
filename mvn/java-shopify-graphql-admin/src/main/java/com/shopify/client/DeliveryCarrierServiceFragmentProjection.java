package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CountryCode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DeliveryCarrierServiceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryCarrierServiceFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierService"));
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryAvailableServiceProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> availableServicesForCountries(
      ) {
     DeliveryAvailableServiceProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryAvailableServiceProjection<>(this, getRoot());
     getFields().put("availableServicesForCountries", projection);
     return projection;
  }

  public DeliveryAvailableServiceProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> availableServicesForCountries(
      List<String> origins, List<CountryCode> countryCodes, boolean restOfWorld) {
    DeliveryAvailableServiceProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryAvailableServiceProjection<>(this, getRoot());    
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

  public ImageProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> icon() {
     ImageProjection<DeliveryCarrierServiceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> formattedName() {
    getFields().put("formattedName", null);
    return this;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryCarrierServiceFragmentProjection<PARENT, ROOT> supportsServiceDiscovery() {
    getFields().put("supportsServiceDiscovery", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryCarrierService {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
