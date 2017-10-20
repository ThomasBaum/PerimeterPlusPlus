package com.thomasbaum.perimeterplusplus.render;

import org.lwjgl.opengl.GL11;

import java.awt.*;


public class Renderer {




    public static void drawSphere(float cx, float cy, float cz, double rad, int sphereSegments, Color color, float width)
    {
        GL11.glColor3f(color.getRed()/255.0F, color.getGreen()/255.0F, color.getBlue()/255.0F);
        GL11.glPointSize(width);

        final double dPhi = 2*Math.PI / sphereSegments;

        for(double phi = 0.0; phi < 2*Math.PI; phi += dPhi)
        {
            double sinPhi = Math.sin(phi);
            double dTheta = Math.PI / (1 + (int)(sphereSegments * Math.abs(sinPhi/2)));
            GL11.glBegin(GL11.GL_POINTS);
            for(double theta = 0.0; theta < Math.PI; theta += dTheta)
            {
                float dx = (float)(rad * sinPhi * Math.cos(theta));
                float dz = (float)(rad * sinPhi * Math.sin(theta));
                float dy = (float)(rad * Math.cos(phi));
                GL11.glVertex3f(cx+dx, cy+dy, cz+dz);
            }
            GL11.glEnd();
        }
    }

    public void renderLine(){

    }


    public static void renderBox(float ax, float ay, float az, float bx, float by, float bz, Color color){

        GL11.glColor3f(color.getRed()/255.0F, color.getGreen()/255.0F, color.getBlue()/255.0F);
        GL11.glLineWidth(1);

        GL11.glBegin(GL11.GL_LINE_STRIP);
         GL11.glVertex3f(ax, ay, bz);
         GL11.glVertex3f(bx, ay, bz);
         GL11.glVertex3f(bx, ay, az);
         GL11.glVertex3f(ax, ay, az);
         GL11.glVertex3f(ax, ay, bz);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINE_STRIP);
         GL11.glVertex3f(ax, by, bz);
         GL11.glVertex3f(bx, by, bz);
         GL11.glVertex3f(bx, by, az);
         GL11.glVertex3f(ax, by, az);
         GL11.glVertex3f(ax, by, bz);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
         GL11.glVertex3f(ax, ay, bz);
         GL11.glVertex3f(ax, by, bz);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
         GL11.glVertex3f(bx, ay, bz);
        GL11.glVertex3f(bx, by, bz);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3f(bx, ay, az);
        GL11.glVertex3f(bx, by, az);
        GL11.glEnd();
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3f(ax, ay, az);
        GL11.glVertex3f(ax, by, az);
        GL11.glEnd();

    }



    public static void renderSphere(double radius, Color color, double posX, double posY, double posZ){






    }


}
