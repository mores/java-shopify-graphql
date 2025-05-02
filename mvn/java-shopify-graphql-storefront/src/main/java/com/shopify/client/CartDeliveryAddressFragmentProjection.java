package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CartDeliveryAddressFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartDeliveryAddressFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryAddress"));
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> formatted() {
    getFields().put("formatted", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection formatted(Boolean withCompany, Boolean withName) {
    getFields().put("formatted", null);
    getInputArguments().computeIfAbsent("formatted", k -> new ArrayList<>());
    InputArgument withCompanyArg = new InputArgument("withCompany", withCompany);
    getInputArguments().get("formatted").add(withCompanyArg);
    InputArgument withNameArg = new InputArgument("withName", withName);
    getInputArguments().get("formatted").add(withNameArg);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> formattedArea() {
    getFields().put("formattedArea", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> latitude() {
    getFields().put("latitude", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> longitude() {
    getFields().put("longitude", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<PARENT, ROOT> zip() {
    getFields().put("zip", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartDeliveryAddress {");
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
