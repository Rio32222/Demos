/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.customview;

public final class R {
    public static final class attr {
        /** <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static final int color=0x7f010000;
        /** <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>small</code></td><td>0x01</td><td></td></tr>
<tr><td><code>middle</code></td><td>0x02</td><td></td></tr>
</table>
         */
        public static final int mode=0x7f010002;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int movingenable=0x7f010001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
    }
    public static final class id {
        public static final int lLayout=0x7f040002;
        public static final int middle=0x7f040001;
        public static final int rLayout=0x7f040003;
        public static final int small=0x7f040000;
    }
    public static final class layout {
        public static final int activity_attrscustom=0x7f030000;
        public static final int activity_simplecustom=0x7f030001;
    }
    public static final class string {
        public static final int app_name=0x7f050000;
        public static final int hello_world=0x7f050001;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f060001;
    }
    public static final class styleable {
        /** Attributes that can be used with a AttrsCustomView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AttrsCustomView_color com.example.customview:color}</code></td><td></td></tr>
           <tr><td><code>{@link #AttrsCustomView_mode com.example.customview:mode}</code></td><td></td></tr>
           <tr><td><code>{@link #AttrsCustomView_movingenable com.example.customview:movingenable}</code></td><td></td></tr>
           </table>
           @see #AttrsCustomView_color
           @see #AttrsCustomView_mode
           @see #AttrsCustomView_movingenable
         */
        public static final int[] AttrsCustomView = {
            0x7f010000, 0x7f010001, 0x7f010002
        };
        /**
          <p>This symbol is the offset where the {@link com.example.customview.R.attr#color}
          attribute's value can be found in the {@link #AttrsCustomView} array.


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          @attr name com.example.customview:color
        */
        public static final int AttrsCustomView_color = 0;
        /**
          <p>This symbol is the offset where the {@link com.example.customview.R.attr#mode}
          attribute's value can be found in the {@link #AttrsCustomView} array.


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>small</code></td><td>0x01</td><td></td></tr>
<tr><td><code>middle</code></td><td>0x02</td><td></td></tr>
</table>
          @attr name com.example.customview:mode
        */
        public static final int AttrsCustomView_mode = 2;
        /**
          <p>This symbol is the offset where the {@link com.example.customview.R.attr#movingenable}
          attribute's value can be found in the {@link #AttrsCustomView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.example.customview:movingenable
        */
        public static final int AttrsCustomView_movingenable = 1;
    };
}
