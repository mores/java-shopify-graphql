package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.ArticleSortKeys;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BlogByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Blog"));
  }

  public BlogByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> articleByHandle(
      ) {
    ArticleProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("articleByHandle", projection);
    return projection;
  }

  public ArticleProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> articleByHandle(
      String handle) {
    ArticleProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("articleByHandle", projection);
    getInputArguments().computeIfAbsent("articleByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("articleByHandle").add(handleArg);
    return projection;
  }

  public ArticleConnectionProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> articles(
      ) {
    ArticleConnectionProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new ArticleConnectionProjection<>(this, this);    
    getFields().put("articles", projection);
    return projection;
  }

  public ArticleConnectionProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> articles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ArticleSortKeys sortKey, String query) {
    ArticleConnectionProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new ArticleConnectionProjection<>(this, this);    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("articles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("articles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("articles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("articles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("articles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("articles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("articles").add(queryArg);
    return projection;
  }

  public ArticleAuthorProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> authors(
      ) {
    ArticleAuthorProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorProjection<>(this, this);    
    getFields().put("authors", projection);
    return projection;
  }

  public MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<BlogByHandleProjectionRoot<PARENT, ROOT>, BlogByHandleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public BlogByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public BlogByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BlogByHandleProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public BlogByHandleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
