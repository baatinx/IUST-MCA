.model small
.stack 100h
.data
        num1 db ?
        num2 db ?
        sum db 0                           ;10,13 = new line
        d db 10
        temp db ?
        msg1 db 10,13,"enter the first  number : $"
        msg2 db 10,13,"enter the second number : $"
        msg3 db 10,13,"sum of two numbers is : $"
.code
        mov ax,@data
        mov ds,ax

        mov dx,offset msg1
        mov ah,09h             ; print msg
        int 21h          

        mov ah,01h   ;takes input from user and places in al
        int 21h
        sub al,30h   ;in al number is in binary code decimal(bcd) form eg 5=35h by subtracting it by 30h we get number back ie 5
        mov num1,al

        mov dx,offset msg2
        mov ah,09h
        int 21h

        mov ah,01h
        int 21h
        sub al,30h
        mov num2,al

        add al,num1
        mov sum,al
     
        mov dx,offset msg3
        mov ah,09h
        int 21h

        mov al,sum
        mov ah,0
        div d
        mov temp,ah

        add al,48
        mov dl,al
        mov ah,02h
        int 21h

        mov al,temp
        add al,48
        mov dl,al
        mov ah,02h
        int 21h

              
        mov ah,4ch
        int 21h
end

                                        
