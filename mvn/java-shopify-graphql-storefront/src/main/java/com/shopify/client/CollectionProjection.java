package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.HasMetafieldsIdentifier;
import com.shopify.types.ProductCollectionSortKeys;
import com.shopify.types.ProductFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CollectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Collection"));
  }

  public CollectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<CollectionProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> products(
      String after, String before, List<ProductFilter> filters, Integer first, Integer last,
      Boolean reverse, ProductCollectionSortKeys sortKey) {
    ProductConnectionProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument filtersArg = new InputArgument("filters", filters);
    getInputArguments().get("products").add(filtersArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    return projection;
  }

  public SEOProjection<CollectionProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<CollectionProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public CollectionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionProjection description(Integer truncateAt) {
    getFields().put("description", null);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public CollectionProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
