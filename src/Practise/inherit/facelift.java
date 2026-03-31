package Practise.inherit;

public class facelift extends organisation_parent
{
    public void AudioSystem()
    {
        System.out.println("new audio for 2026");
    }
    public void enginesetup()
    {
        System.out.println("new engine for 2026");
    }
    public static void main(String[] args)
    {
        facelift face=new facelift();
        face.AudioSystem();
        face.enginesetup();
        face.designsetup();

    }


}
