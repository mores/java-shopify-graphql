package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ArticleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleProjectionRoot() {
    super(null, null, java.util.Optional.of("Article"));
  }

  public ArticleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> author(
      ) {
    ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> authorV2(
      ) {
    ArticleAuthorProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new ArticleAuthorProjection<>(this, this);    
    getFields().put("authorV2", projection);
    return projection;
  }

  public BlogProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> blog(
      ) {
    BlogProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new BlogProjection<>(this, this);    
    getFields().put("blog", projection);
    return projection;
  }

  public CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> comments(
      ) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
    getFields().put("comments", projection);
    return projection;
  }

  public CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> comments(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("comments").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("comments").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("comments").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("comments").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("comments").add(reverseArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> content(
      Integer truncateAt) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("content", projection);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("content").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> excerpt(
      Integer truncateAt) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("excerpt", projection);
    getInputArguments().computeIfAbsent("excerpt", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("excerpt").add(truncateAtArg);
    return projection;
  }

  public ImageProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafield(
      String key, String namespace) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public ArticleProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> contentHtml() {
    getFields().put("contentHtml", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> excerpt() {
    getFields().put("excerpt", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> excerptHtml() {
    getFields().put("excerptHtml", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ArticleProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }
}
