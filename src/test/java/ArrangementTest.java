import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrangementTest {

    @Test
    public void was_Name_Long_Enough(){

        assertEquals("name Ok", Arrangement.isNameLongEnough("Vasaloppet"));
        assertEquals("name too long", Arrangement.isNameLongEnough("VasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppetVasaloppet"));
        assertEquals("name too short", Arrangement.isNameLongEnough("Vasa"));


    }
}
