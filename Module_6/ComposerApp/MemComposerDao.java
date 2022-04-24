/*
    Author: Janzal Karlo Sonza
    Date: 04/21/2022
*/

import java.util.*;

public class MemComposerDao implements ComposerDao{
    private List<Composer> composers = new ArrayList<Composer>();

    public MemComposerDao(){
        Composer composer = new Composer(1007,"Ludwig Van Beethoven","Classical");
        composers.add(composer);
        composer = new Composer(1008,"Johann Sebastian Bach","Classical");
        composers.add(composer);
        composer = new Composer(1009,"Wolfgang Amadeus Mozart","Classical");
        composers.add(composer);
        composer = new Composer(1010,"Johannes Brahms","Classical");
        composers.add(composer);
        composer = new Composer(1011,"Joseph Haydn","Classical");
        composers.add(composer);
    }

    @Override
    public List<Composer> findAll(){
        return composers;
    }

    @Override
    public Composer findBy(Integer id){
        for(Composer composer : composers){
            if(composer.getID() == id){
                return composer;
            }
        }
        return null;
    }

    @Override
    public void insert(Composer composer){
        composers.add(composer);
    }
}