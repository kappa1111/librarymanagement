package librarymanagement.domain.request;

import librarymanagement.domain.entity.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class AuthorRequest {

    @NotBlank(message = "작가의 이름에는 공백을 사용할 수 없습니다.")
    private String authorName;

    public Author toEntity(AuthorRequest authorRequest) {
        return Author.createBuilder()
                .name(authorRequest.authorName)
                .build();
    }

}
