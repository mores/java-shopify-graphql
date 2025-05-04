package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import com.shopify.storefront.types.ProductCollectionSortKeys;
import com.shopify.storefront.types.ProductFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CollectionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionProjectionRoot() {
    super(null, null, java.util.Optional.of("Collection"));
  }

  public CollectionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public ImageProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductCollectionSortKeys sortKey, List<ProductFilter> filters) {
    ProductConnectionProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument filtersArg = new InputArgument("filters", filters);
    getInputArguments().get("products").add(filtersArg);
    return projection;
  }

  public SEOProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<CollectionProjectionRoot<PARENT, ROOT>, CollectionProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public CollectionProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public CollectionProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
