package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the file copy.
 */
public class ThemeFilesCopyFileInput {
  /**
   * The new file where the content is copied to.
   */
  private String dstFilename;

  /**
   * The source file to copy from.
   */
  private String srcFilename;

  public ThemeFilesCopyFileInput() {
  }

  /**
   * The new file where the content is copied to.
   */
  public String getDstFilename() {
    return dstFilename;
  }

  public void setDstFilename(String dstFilename) {
    this.dstFilename = dstFilename;
  }

  /**
   * The source file to copy from.
   */
  public String getSrcFilename() {
    return srcFilename;
  }

  public void setSrcFilename(String srcFilename) {
    this.srcFilename = srcFilename;
  }

  @Override
  public String toString() {
    return "ThemeFilesCopyFileInput{dstFilename='" + dstFilename + "', srcFilename='" + srcFilename + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ThemeFilesCopyFileInput that = (ThemeFilesCopyFileInput) o;
    return Objects.equals(dstFilename, that.dstFilename) &&
        Objects.equals(srcFilename, that.srcFilename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dstFilename, srcFilename);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new file where the content is copied to.
     */
    private String dstFilename;

    /**
     * The source file to copy from.
     */
    private String srcFilename;

    public ThemeFilesCopyFileInput build() {
      ThemeFilesCopyFileInput result = new ThemeFilesCopyFileInput();
      result.dstFilename = this.dstFilename;
      result.srcFilename = this.srcFilename;
      return result;
    }

    /**
     * The new file where the content is copied to.
     */
    public Builder dstFilename(String dstFilename) {
      this.dstFilename = dstFilename;
      return this;
    }

    /**
     * The source file to copy from.
     */
    public Builder srcFilename(String srcFilename) {
      this.srcFilename = srcFilename;
      return this;
    }
  }
}
