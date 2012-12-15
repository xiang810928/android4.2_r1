/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class TContentType extends Token
{
    public TContentType()
    {
        super.setText("content-type");
    }

    public TContentType(int line, int pos)
    {
        super.setText("content-type");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TContentType(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTContentType(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TContentType text.");
    }
}
