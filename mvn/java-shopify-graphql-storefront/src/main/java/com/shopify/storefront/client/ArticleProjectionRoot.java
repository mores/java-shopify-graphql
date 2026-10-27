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
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("comments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("comments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("comments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("comments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("comments").add(reverseArg);
    return projection;
  }

  public CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> commentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CommentConnectionProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new CommentConnectionProjection<>(this, this);    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("comments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("comments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("comments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("comments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("comments").add(reverseArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> content(
      Integer truncateAt) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("content", projection);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("content").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> contentWithVariableReferences(
      String truncateAtReference) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("content", projection);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());              
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAtReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("content").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> excerpt(
      Integer truncateAt) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("excerpt", projection);
    getInputArguments().computeIfAbsent("excerpt", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("excerpt").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> excerptWithVariableReferences(
      String truncateAtReference) {
    StringProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("excerpt", projection);
    getInputArguments().computeIfAbsent("excerpt", k -> new ArrayList<>());              
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAtReference, true, new graphql.language.TypeName("Int"));
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
      String namespace, String key) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
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
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<ArticleProjectionRoot<PARENT, ROOT>, ArticleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
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
