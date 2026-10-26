package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ArticleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ArticleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Article"));
  }

  public ArticleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> author() {
     ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> authorV2() {
     ArticleAuthorProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("authorV2", projection);
     return projection;
  }

  public BlogProjection<ArticleProjection<PARENT, ROOT>, ROOT> blog() {
     BlogProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("blog", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> comments() {
     CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());
     getFields().put("comments", projection);
     return projection;
  }

  public CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> comments(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());    
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

  public CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> commentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CommentConnectionProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());    
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

  public ImageProjection<ArticleProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<ArticleProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<ArticleProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public ArticleProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ArticleProjection content(Integer truncateAt) {
    getFields().put("content", null);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("content").add(truncateAtArg);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> contentHtml() {
    getFields().put("contentHtml", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> excerpt() {
    getFields().put("excerpt", null);
    return this;
  }

  public ArticleProjection excerpt(Integer truncateAt) {
    getFields().put("excerpt", null);
    getInputArguments().computeIfAbsent("excerpt", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("excerpt").add(truncateAtArg);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> excerptHtml() {
    getFields().put("excerptHtml", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ArticleProjection<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }
}
