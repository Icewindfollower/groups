package testapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testapp.domain.Theme;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ThemeService {
    public long themeId = 1L;
    public Map<Long, Theme> allThemes = new HashMap<Long, Theme>();

    public List<Theme> getGroupThemes(int groupId) {
        List<Theme> groupThemes = new ArrayList<Theme>();
        for (Map.Entry<Long, Theme> entry : allThemes.entrySet()) {
            if (entry.getValue().getId() == groupId) {
                groupThemes.add(entry.getValue());
            }
        }
        return groupThemes;
    }

    public void addTheme(int groupId, String text) {
        if (text == null) {
            throw new IllegalArgumentException("Empty text");
        }
        Theme newTheme = new Theme();
        newTheme.setText(text);
        newTheme.setId(groupId);
        allThemes.put(themeId, newTheme);
        themeId++;
    }
}
