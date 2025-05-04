package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.CropRegion;
import com.shopify.storefront.types.ImageContentType;
import com.shopify.storefront.types.ImageTransformInput;
import java.lang.Integer;
import java.util.ArrayList;

public class ImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Image"));
  }

  public ImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> altText() {
    getFields().put("altText", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> height() {
    getFields().put("height", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> originalSrc() {
    getFields().put("originalSrc", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ImageProjection<PARENT, ROOT> transformedSrc() {
    getFields().put("transformedSrc", null);
    return this;
  }

  public ImageProjection transformedSrc(Integer maxWidth, Integer maxHeight, CropRegion crop,
      Integer scale, ImageContentType preferredContentType) {
    getFields().put("transformedSrc", null);
    getInputArguments().computeIfAbsent("transformedSrc", k -> new ArrayList<>());
    InputArgument maxWidthArg = new InputArgument("maxWidth", maxWidth);
    getInputArguments().get("transformedSrc").add(maxWidthArg);
    InputArgument maxHeightArg = new InputArgument("maxHeight", maxHeight);
    getInputArguments().get("transformedSrc").add(maxHeightArg);
    InputArgument cropArg = new InputArgument("crop", crop);
    getInputArguments().get("transformedSrc").add(cropArg);
    InputArgument scaleArg = new InputArgument("scale", scale);
    getInputArguments().get("transformedSrc").add(scaleArg);
    InputArgument preferredContentTypeArg = new InputArgument("preferredContentType", preferredContentType);
    getInputArguments().get("transformedSrc").add(preferredContentTypeArg);
    return this;
  }

  public ImageProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  public ImageProjection url(ImageTransformInput transform) {
    getFields().put("url", null);
    getInputArguments().computeIfAbsent("url", k -> new ArrayList<>());
    InputArgument transformArg = new InputArgument("transform", transform);
    getInputArguments().get("url").add(transformArg);
    return this;
  }

  public ImageProjection<PARENT, ROOT> width() {
    getFields().put("width", null);
    return this;
  }
}
